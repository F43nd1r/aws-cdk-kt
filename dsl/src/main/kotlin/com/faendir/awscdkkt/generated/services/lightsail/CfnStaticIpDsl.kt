package com.faendir.awscdkkt.generated.services.lightsail

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.lightsail.CfnStaticIp
import software.amazon.awscdk.services.lightsail.CfnStaticIpProps
import software.constructs.Construct

@Generated
public fun Construct.cfnStaticIp(
  id: String,
  props: CfnStaticIpProps,
  initializer: @AwsCdkDsl CfnStaticIp.() -> Unit = {},
): CfnStaticIp = CfnStaticIp(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnStaticIp(id: String, initializer: @AwsCdkDsl CfnStaticIp.Builder.() -> Unit = {}): CfnStaticIp = CfnStaticIp.Builder.create(this, id).apply(initializer).build()
