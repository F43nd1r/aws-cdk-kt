package com.faendir.awscdkkt.generated.services.frauddetector

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.frauddetector.CfnDetector
import software.amazon.awscdk.services.frauddetector.CfnDetectorProps
import software.constructs.Construct

@Generated
public fun Construct.cfnDetector(
  id: String,
  props: CfnDetectorProps,
  initializer: @AwsCdkDsl CfnDetector.() -> Unit = {},
): CfnDetector = CfnDetector(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnDetector(id: String, initializer: @AwsCdkDsl
    CfnDetector.Builder.() -> Unit = {}): CfnDetector = CfnDetector.Builder.create(this,
    id).apply(initializer).build()
