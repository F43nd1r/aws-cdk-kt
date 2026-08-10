package com.faendir.awscdkkt.generated.services.fis

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.fis.CfnSafetyLever
import software.amazon.awscdk.services.fis.CfnSafetyLeverProps
import software.constructs.Construct

@Generated
public fun Construct.cfnSafetyLever(id: String, initializer: @AwsCdkDsl CfnSafetyLever.() -> Unit = {}): CfnSafetyLever = CfnSafetyLever(this, id).apply(initializer)

@Generated
public fun Construct.cfnSafetyLever(
  id: String,
  props: CfnSafetyLeverProps,
  initializer: @AwsCdkDsl CfnSafetyLever.() -> Unit = {},
): CfnSafetyLever = CfnSafetyLever(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnSafetyLever(id: String, initializer: @AwsCdkDsl CfnSafetyLever.Builder.() -> Unit = {}): CfnSafetyLever = CfnSafetyLever.Builder.create(this, id).apply(initializer).build()
