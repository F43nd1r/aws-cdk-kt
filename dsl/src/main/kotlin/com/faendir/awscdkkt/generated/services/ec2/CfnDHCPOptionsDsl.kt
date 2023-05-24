package com.faendir.awscdkkt.generated.services.ec2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnDHCPOptions
import software.amazon.awscdk.services.ec2.CfnDHCPOptionsProps
import software.constructs.Construct

@Generated
public fun Construct.cfnDHCPOptions(id: String, props: CfnDHCPOptionsProps): CfnDHCPOptions =
    CfnDHCPOptions(this, id, props)

@Generated
public fun Construct.cfnDHCPOptions(
  id: String,
  props: CfnDHCPOptionsProps,
  initializer: @AwsCdkDsl CfnDHCPOptions.() -> Unit,
): CfnDHCPOptions = CfnDHCPOptions(this, id, props).apply(initializer)

@Generated
public fun Construct.cfnDHCPOptions(id: String): CfnDHCPOptions = CfnDHCPOptions(this, id)

@Generated
public fun Construct.cfnDHCPOptions(id: String, initializer: @AwsCdkDsl CfnDHCPOptions.() -> Unit):
    CfnDHCPOptions = CfnDHCPOptions(this, id).apply(initializer)

@Generated
public fun Construct.buildCfnDHCPOptions(id: String, initializer: @AwsCdkDsl
    CfnDHCPOptions.Builder.() -> Unit): CfnDHCPOptions = CfnDHCPOptions.Builder.create(this,
    id).apply(initializer).build()
