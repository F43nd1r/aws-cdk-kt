package com.faendir.awscdkkt.generated.services.rekognition

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.rekognition.CfnStreamProcessor
import software.amazon.awscdk.services.rekognition.CfnStreamProcessorProps
import software.constructs.Construct

@Generated
public fun Construct.cfnStreamProcessor(id: String, props: CfnStreamProcessorProps):
    CfnStreamProcessor = CfnStreamProcessor(this, id, props)

@Generated
public fun Construct.cfnStreamProcessor(
  id: String,
  props: CfnStreamProcessorProps,
  initializer: @AwsCdkDsl CfnStreamProcessor.() -> Unit,
): CfnStreamProcessor = CfnStreamProcessor(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnStreamProcessor(id: String, initializer: @AwsCdkDsl
    CfnStreamProcessor.Builder.() -> Unit): CfnStreamProcessor =
    CfnStreamProcessor.Builder.create(this, id).apply(initializer).build()
