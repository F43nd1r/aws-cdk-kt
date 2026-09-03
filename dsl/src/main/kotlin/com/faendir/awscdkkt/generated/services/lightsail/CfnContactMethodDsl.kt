package com.faendir.awscdkkt.generated.services.lightsail

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.lightsail.CfnContactMethod
import software.amazon.awscdk.services.lightsail.CfnContactMethodProps
import software.constructs.Construct

@Generated
public fun Construct.cfnContactMethod(
  id: String,
  props: CfnContactMethodProps,
  initializer: @AwsCdkDsl CfnContactMethod.() -> Unit = {},
): CfnContactMethod = CfnContactMethod(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnContactMethod(id: String, initializer: @AwsCdkDsl CfnContactMethod.Builder.() -> Unit = {}): CfnContactMethod = CfnContactMethod.Builder.create(this, id).apply(initializer).build()
