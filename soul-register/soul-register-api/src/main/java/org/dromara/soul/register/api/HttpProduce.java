/*
 *     Licensed to the Apache Software Foundation (ASF) under one or more
 *     contributor license agreements.See the NOTICE file distributed with
 *     this work for additional information regarding copyright ownership.
 *     The ASF licenses this file to You under the Apache License, Version 2.0
 *     (the "License"); you may not use this file except in compliance with
 *     the License.You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *     Unless required by applicable law or agreed to in writing, software
 *     distributed under the License is distributed on an "AS IS" BASIS,
 *     WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *     See the License for the specific language governing permissions and
 *     limitations under the License.
 */

package org.dromara.soul.register.api;

import org.dromara.soul.register.api.path.Path;

/**
 * HttpProduce .
 * Finally, provide the process for the http want to close.
 * Dubbo and other related rpc frameworks are converted into Http addresses that the soul platform can recognize.
 *
 * @param <T> the type parameter.
 * @author sixh
 */
public interface HttpProduce<T extends Path> {

    /**
     * Produce.
     *
     * @param path the path.
     */
    void produce(T path);
}