package com.faendir.awscdkkt.generated.services.ec2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnVPNConcentrator
import software.amazon.awscdk.services.ec2.CfnVPNConcentratorProps
import software.constructs.Construct

@Generated
public fun Construct.cfnVPNConcentrator(
  id: String,
  props: CfnVPNConcentratorProps,
  initializer: @AwsCdkDsl CfnVPNConcentrator.() -> Unit = {},
): CfnVPNConcentrator = CfnVPNConcentrator(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnVPNConcentrator(id: String, initializer: @AwsCdkDsl CfnVPNConcentrator.Builder.() -> Unit = {}): CfnVPNConcentrator = CfnVPNConcentrator.Builder.create(this, id).apply(initializer).build()
