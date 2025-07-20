package com.faendir.awscdkkt.generated.services.appconfig

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.appconfig.CfnExtension
import software.amazon.awscdk.services.appconfig.CfnExtensionProps
import software.constructs.Construct

@Generated
public fun Construct.cfnExtension(
  id: String,
  props: CfnExtensionProps,
  initializer: @AwsCdkDsl CfnExtension.() -> Unit = {},
): CfnExtension = CfnExtension(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnExtension(id: String, initializer: @AwsCdkDsl CfnExtension.Builder.() -> Unit = {}): CfnExtension = CfnExtension.Builder.create(this, id).apply(initializer).build()
