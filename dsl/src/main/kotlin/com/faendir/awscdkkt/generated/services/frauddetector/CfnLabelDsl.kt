package com.faendir.awscdkkt.generated.services.frauddetector

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.frauddetector.CfnLabel
import software.amazon.awscdk.services.frauddetector.CfnLabelProps
import software.constructs.Construct

@Generated
public fun Construct.cfnLabel(
  id: String,
  props: CfnLabelProps,
  initializer: @AwsCdkDsl CfnLabel.() -> Unit = {},
): CfnLabel = CfnLabel(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnLabel(id: String, initializer: @AwsCdkDsl CfnLabel.Builder.() -> Unit = {}): CfnLabel = CfnLabel.Builder.create(this, id).apply(initializer).build()
