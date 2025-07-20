package com.faendir.awscdkkt.generated.services.guardduty

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.guardduty.CfnDetector
import software.amazon.awscdk.services.guardduty.CfnDetectorProps
import software.constructs.Construct

@Generated
public fun Construct.cfnDetector(
  id: String,
  props: CfnDetectorProps,
  initializer: @AwsCdkDsl CfnDetector.() -> Unit = {},
): CfnDetector = CfnDetector(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnDetector(id: String, initializer: @AwsCdkDsl CfnDetector.Builder.() -> Unit = {}): CfnDetector = CfnDetector.Builder.create(this, id).apply(initializer).build()
