package com.faendir.awscdkkt.generated.services.stepfunctions.tasks

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.tasks.MediaConvertCreateJob
import software.amazon.awscdk.services.stepfunctions.tasks.MediaConvertCreateJobProps
import software.constructs.Construct

@Generated
public fun Construct.mediaConvertCreateJob(
  id: String,
  props: MediaConvertCreateJobProps,
  initializer: @AwsCdkDsl MediaConvertCreateJob.() -> Unit = {},
): MediaConvertCreateJob = MediaConvertCreateJob(this, id, props).apply(initializer)

@Generated
public fun Construct.buildMediaConvertCreateJob(id: String, initializer: @AwsCdkDsl
    MediaConvertCreateJob.Builder.() -> Unit = {}): MediaConvertCreateJob =
    MediaConvertCreateJob.Builder.create(this, id).apply(initializer).build()
