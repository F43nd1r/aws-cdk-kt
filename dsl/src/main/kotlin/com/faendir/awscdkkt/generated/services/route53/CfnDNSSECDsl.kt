package com.faendir.awscdkkt.generated.services.route53

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.route53.CfnDNSSEC
import software.amazon.awscdk.services.route53.CfnDNSSECProps
import software.constructs.Construct

@Generated
public fun Construct.cfnDNSSEC(
  id: String,
  props: CfnDNSSECProps,
  initializer: @AwsCdkDsl CfnDNSSEC.() -> Unit = {},
): CfnDNSSEC = CfnDNSSEC(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnDNSSEC(id: String, initializer: @AwsCdkDsl CfnDNSSEC.Builder.() -> Unit = {}): CfnDNSSEC = CfnDNSSEC.Builder.create(this, id).apply(initializer).build()
