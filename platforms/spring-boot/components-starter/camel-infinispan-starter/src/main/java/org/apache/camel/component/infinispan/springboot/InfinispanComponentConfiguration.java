/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.component.infinispan.springboot;

import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import javax.annotation.Generated;
import org.apache.camel.component.infinispan.InfinispanCustomListener;
import org.apache.camel.component.infinispan.InfinispanOperation;
import org.apache.camel.component.infinispan.InfinispanQueryBuilder;
import org.apache.camel.spring.boot.ComponentConfigurationPropertiesCommon;
import org.infinispan.commons.api.BasicCacheContainer;
import org.infinispan.context.Flag;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.DeprecatedConfigurationProperty;

/**
 * For reading/writing from/to Infinispan distributed key/value store and data
 * grid.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.SpringBootAutoConfigurationMojo")
@ConfigurationProperties(prefix = "camel.component.infinispan")
public class InfinispanComponentConfiguration
        extends
            ComponentConfigurationPropertiesCommon {

    /**
     * Whether to enable auto configuration of the infinispan component. This is
     * enabled by default.
     */
    private Boolean enabled;
    /**
     * The default configuration shared among endpoints.
     */
    private InfinispanConfigurationNestedConfiguration configuration;
    /**
     * The default cache container. The option is a
     * org.infinispan.commons.api.BasicCacheContainer type.
     */
    private String cacheContainer;
    /**
     * Whether the component should use basic property binding (Camel 2.x) or
     * the newer property binding with additional capabilities
     */
    private Boolean basicPropertyBinding = false;
    /**
     * Whether the producer should be started lazy (on the first message). By
     * starting lazy you can use this to allow CamelContext and routes to
     * startup in situations where a producer may otherwise fail during starting
     * and cause the route to fail being started. By deferring this startup to
     * be lazy then the startup failure can be handled during routing messages
     * via Camel's routing error handlers. Beware that when the first message is
     * processed then creating and starting the producer may take a little time
     * and prolong the total processing time of the processing.
     */
    private Boolean lazyStartProducer = false;
    /**
     * Allows for bridging the consumer to the Camel routing Error Handler,
     * which mean any exceptions occurred while the consumer is trying to pickup
     * incoming messages, or the likes, will now be processed as a message and
     * handled by the routing Error Handler. By default the consumer will use
     * the org.apache.camel.spi.ExceptionHandler to deal with exceptions, that
     * will be logged at WARN or ERROR level and ignored.
     */
    private Boolean bridgeErrorHandler = false;

    public InfinispanConfigurationNestedConfiguration getConfiguration() {
        return configuration;
    }

    public void setConfiguration(
            InfinispanConfigurationNestedConfiguration configuration) {
        this.configuration = configuration;
    }

    public String getCacheContainer() {
        return cacheContainer;
    }

    public void setCacheContainer(String cacheContainer) {
        this.cacheContainer = cacheContainer;
    }

    public Boolean getBasicPropertyBinding() {
        return basicPropertyBinding;
    }

    public void setBasicPropertyBinding(Boolean basicPropertyBinding) {
        this.basicPropertyBinding = basicPropertyBinding;
    }

    public Boolean getLazyStartProducer() {
        return lazyStartProducer;
    }

    public void setLazyStartProducer(Boolean lazyStartProducer) {
        this.lazyStartProducer = lazyStartProducer;
    }

    public Boolean getBridgeErrorHandler() {
        return bridgeErrorHandler;
    }

    public void setBridgeErrorHandler(Boolean bridgeErrorHandler) {
        this.bridgeErrorHandler = bridgeErrorHandler;
    }

    public static class InfinispanConfigurationNestedConfiguration {
        public static final Class CAMEL_NESTED_CLASS = org.apache.camel.component.infinispan.InfinispanConfiguration.class;
        /**
         * The operation to perform.
         */
        @Deprecated
        private String command = "PUT";
        /**
         * The operation to perform.
         */
        private InfinispanOperation operation = InfinispanOperation.PUT;
        /**
         * Specifies the host of the cache on Infinispan instance
         */
        private String hosts;
        /**
         * Specifies the cache Container to connect
         */
        private BasicCacheContainer cacheContainer;
        /**
         * If true, the consumer will receive notifications synchronously
         */
        private Boolean sync = true;
        /**
         * If true, the listener will be installed for the entire cluster
         */
        private Boolean clusteredListener = false;
        /**
         * Specifies the set of event types to register by the consumer.
         * Multiple event can be separated by comma. <p/> The possible event
         * types are: CACHE_ENTRY_ACTIVATED, CACHE_ENTRY_PASSIVATED,
         * CACHE_ENTRY_VISITED, CACHE_ENTRY_LOADED, CACHE_ENTRY_EVICTED,
         * CACHE_ENTRY_CREATED, CACHE_ENTRY_REMOVED, CACHE_ENTRY_MODIFIED,
         * TRANSACTION_COMPLETED, TRANSACTION_REGISTERED,
         * CACHE_ENTRY_INVALIDATED, DATA_REHASHED, TOPOLOGY_CHANGED,
         * PARTITION_STATUS_CHANGED
         */
        private Set eventTypes;
        /**
         * Returns the custom listener in use, if provided
         */
        private InfinispanCustomListener customListener;
        /**
         * Specifies the query builder.
         */
        private InfinispanQueryBuilder queryBuilder;
        /**
         * A comma separated list of Flag to be applied by default on each cache
         * invocation, not applicable to remote caches.
         */
        private Flag[] flags;
        /**
         * An implementation specific URI for the CacheManager
         */
        private String configurationUri;
        /**
         * Implementation specific properties for the CacheManager
         */
        private Map configurationProperties;
        /**
         * The CacheContainer configuration. Uses if the cacheContainer is not
         * defined. Must be the following types:
         * org.infinispan.client.hotrod.configuration.Configuration - for remote
         * cache interaction configuration;
         * org.infinispan.configuration.cache.Configuration - for embedded cache
         * interaction configuration;
         */
        private Object cacheContainerConfiguration;
        /**
         * Store the operation result in a header instead of the message body.
         * By default, resultHeader == null and the query result is stored in
         * the message body, any existing content in the message body is
         * discarded. If resultHeader is set, the value is used as the name of
         * the header to store the query result and the original message body is
         * preserved. This value can be overridden by an in message header
         * named: CamelInfinispanOperationResultHeader
         */
        private Object resultHeader;
        /**
         * Set a specific remappingFunction to use in a compute operation
         */
        private BiFunction remappingFunction;

        @Deprecated
        @DeprecatedConfigurationProperty
        public String getCommand() {
            return command;
        }

        @Deprecated
        public void setCommand(String command) {
            this.command = command;
        }

        public InfinispanOperation getOperation() {
            return operation;
        }

        public void setOperation(InfinispanOperation operation) {
            this.operation = operation;
        }

        public String getHosts() {
            return hosts;
        }

        public void setHosts(String hosts) {
            this.hosts = hosts;
        }

        public BasicCacheContainer getCacheContainer() {
            return cacheContainer;
        }

        public void setCacheContainer(BasicCacheContainer cacheContainer) {
            this.cacheContainer = cacheContainer;
        }

        public Boolean getSync() {
            return sync;
        }

        public void setSync(Boolean sync) {
            this.sync = sync;
        }

        public Boolean getClusteredListener() {
            return clusteredListener;
        }

        public void setClusteredListener(Boolean clusteredListener) {
            this.clusteredListener = clusteredListener;
        }

        public Set getEventTypes() {
            return eventTypes;
        }

        public void setEventTypes(Set eventTypes) {
            this.eventTypes = eventTypes;
        }

        public InfinispanCustomListener getCustomListener() {
            return customListener;
        }

        public void setCustomListener(InfinispanCustomListener customListener) {
            this.customListener = customListener;
        }

        public InfinispanQueryBuilder getQueryBuilder() {
            return queryBuilder;
        }

        public void setQueryBuilder(InfinispanQueryBuilder queryBuilder) {
            this.queryBuilder = queryBuilder;
        }

        public Flag[] getFlags() {
            return flags;
        }

        public void setFlags(Flag[] flags) {
            this.flags = flags;
        }

        public String getConfigurationUri() {
            return configurationUri;
        }

        public void setConfigurationUri(String configurationUri) {
            this.configurationUri = configurationUri;
        }

        public Map getConfigurationProperties() {
            return configurationProperties;
        }

        public void setConfigurationProperties(Map configurationProperties) {
            this.configurationProperties = configurationProperties;
        }

        public Object getCacheContainerConfiguration() {
            return cacheContainerConfiguration;
        }

        public void setCacheContainerConfiguration(
                Object cacheContainerConfiguration) {
            this.cacheContainerConfiguration = cacheContainerConfiguration;
        }

        public Object getResultHeader() {
            return resultHeader;
        }

        public void setResultHeader(Object resultHeader) {
            this.resultHeader = resultHeader;
        }

        public BiFunction getRemappingFunction() {
            return remappingFunction;
        }

        public void setRemappingFunction(BiFunction remappingFunction) {
            this.remappingFunction = remappingFunction;
        }
    }
}