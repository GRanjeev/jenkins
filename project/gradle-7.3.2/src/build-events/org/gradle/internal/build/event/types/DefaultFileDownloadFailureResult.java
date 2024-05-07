/*
 * Copyright 2021 the original author or authors.
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

package org.gradle.internal.build.event.types;

import org.gradle.tooling.internal.protocol.events.InternalFileDownloadResult;

import java.util.List;

public class DefaultFileDownloadFailureResult extends DefaultFailureResult implements InternalFileDownloadResult {
    private final long bytesDownloaded;

    public DefaultFileDownloadFailureResult(long startTime, long endTime, List<DefaultFailure> failures, long bytesDownloaded) {
        super(startTime, endTime, failures);
        this.bytesDownloaded = bytesDownloaded;
    }

    @Override
    public long getBytesDownloaded() {
        return bytesDownloaded;
    }
}
