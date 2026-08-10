package com.faendir.awscdkkt.generated.services.sagemaker

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnTransformJob
import software.amazon.awscdk.services.sagemaker.CfnTransformJobProps
import software.constructs.Construct

@Generated
public fun Construct.cfnTransformJob(
  id: String,
  props: CfnTransformJobProps,
  initializer: @AwsCdkDsl CfnTransformJob.() -> Unit = {},
): CfnTransformJob = CfnTransformJob(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnTransformJob(id: String, initializer: @AwsCdkDsl CfnTransformJob.Builder.() -> Unit = {}): CfnTransformJob = CfnTransformJob.Builder.create(this, id).apply(initializer).build()
