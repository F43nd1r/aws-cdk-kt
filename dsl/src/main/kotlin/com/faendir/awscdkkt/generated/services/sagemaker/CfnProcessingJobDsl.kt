package com.faendir.awscdkkt.generated.services.sagemaker

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnProcessingJob
import software.amazon.awscdk.services.sagemaker.CfnProcessingJobProps
import software.constructs.Construct

@Generated
public fun Construct.cfnProcessingJob(
  id: String,
  props: CfnProcessingJobProps,
  initializer: @AwsCdkDsl CfnProcessingJob.() -> Unit = {},
): CfnProcessingJob = CfnProcessingJob(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnProcessingJob(id: String, initializer: @AwsCdkDsl CfnProcessingJob.Builder.() -> Unit = {}): CfnProcessingJob = CfnProcessingJob.Builder.create(this, id).apply(initializer).build()
