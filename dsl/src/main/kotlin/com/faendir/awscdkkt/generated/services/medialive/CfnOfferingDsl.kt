package com.faendir.awscdkkt.generated.services.medialive

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.medialive.CfnOffering
import software.amazon.awscdk.services.medialive.CfnOfferingProps
import software.constructs.Construct

@Generated
public fun Construct.cfnOffering(id: String, initializer: @AwsCdkDsl CfnOffering.() -> Unit = {}): CfnOffering = CfnOffering(this, id).apply(initializer)

@Generated
public fun Construct.cfnOffering(
  id: String,
  props: CfnOfferingProps,
  initializer: @AwsCdkDsl CfnOffering.() -> Unit = {},
): CfnOffering = CfnOffering(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnOffering(id: String, initializer: @AwsCdkDsl CfnOffering.Builder.() -> Unit = {}): CfnOffering = CfnOffering.Builder.create(this, id).apply(initializer).build()
