package com.faendir.awscdkkt.generated.services.stepfunctions.tasks

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.tasks.BedrockCreateModelCustomizationJob
import software.amazon.awscdk.services.stepfunctions.tasks.BedrockCreateModelCustomizationJobProps
import software.constructs.Construct

@Generated
public fun Construct.bedrockCreateModelCustomizationJob(
  id: String,
  props: BedrockCreateModelCustomizationJobProps,
  initializer: @AwsCdkDsl BedrockCreateModelCustomizationJob.() -> Unit = {},
): BedrockCreateModelCustomizationJob = BedrockCreateModelCustomizationJob(this, id,
    props).apply(initializer)

@Generated
public fun Construct.buildBedrockCreateModelCustomizationJob(id: String, initializer: @AwsCdkDsl
    BedrockCreateModelCustomizationJob.Builder.() -> Unit = {}): BedrockCreateModelCustomizationJob
    = BedrockCreateModelCustomizationJob.Builder.create(this, id).apply(initializer).build()
