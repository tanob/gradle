/*
 * Copyright 2015 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.gradle.tooling.internal.protocol;

/**
 * DO NOT CHANGE THIS INTERFACE. It is part of the cross-version protocol.
 *
 * @since 2.4
 */
public interface TestProgressEventVersion1 extends InternalProtocolInterface {

    String EVENT_TYPE_STARTED = "TEST-STARTED";
    String EVENT_TYPE_FINISHED = "TEST-FINISHED";

    /**
     * Returns the time when the event happened.
     *
     * @return The event time
     */
    long getEventTime();

    /**
     * Returns a human consumable display name for this event.
     */
    String getDisplayName();

    /**
     * Returns the type of the test progress event. See the constants on this interface for the supported event types.
     *
     * @return The type of the test progress event (started, skipped, etc.)
     */
    String getEventType();

    /**
     * Returns the description of the test for which progress is reported.
     *
     * @return The test description
     */
    TestDescriptorVersion1 getDescriptor();

    /**
     * Returns the result of running the test successfully or with a failure.
     *
     * @return The test result
     */
    TestResultVersion1 getResult();

}
