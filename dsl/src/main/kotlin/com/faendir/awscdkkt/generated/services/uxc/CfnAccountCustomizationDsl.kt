package com.faendir.awscdkkt.generated.services.uxc

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.uxc.CfnAccountCustomization
import software.amazon.awscdk.services.uxc.CfnAccountCustomizationProps
import software.constructs.Construct

@Generated
public fun Construct.cfnAccountCustomization(id: String, initializer: @AwsCdkDsl CfnAccountCustomization.() -> Unit = {}): CfnAccountCustomization = CfnAccountCustomization(this, id).apply(initializer)

@Generated
public fun Construct.cfnAccountCustomization(
  id: String,
  props: CfnAccountCustomizationProps,
  initializer: @AwsCdkDsl CfnAccountCustomization.() -> Unit = {},
): CfnAccountCustomization = CfnAccountCustomization(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnAccountCustomization(id: String, initializer: @AwsCdkDsl CfnAccountCustomization.Builder.() -> Unit = {}): CfnAccountCustomization = CfnAccountCustomization.Builder.create(this, id).apply(initializer).build()
