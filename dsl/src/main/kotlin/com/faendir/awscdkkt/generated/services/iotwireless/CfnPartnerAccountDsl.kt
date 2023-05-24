package com.faendir.awscdkkt.generated.services.iotwireless

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iotwireless.CfnPartnerAccount
import software.amazon.awscdk.services.iotwireless.CfnPartnerAccountProps
import software.constructs.Construct

@Generated
public fun Construct.cfnPartnerAccount(id: String): CfnPartnerAccount = CfnPartnerAccount(this, id)

@Generated
public fun Construct.cfnPartnerAccount(id: String, initializer: @AwsCdkDsl
    CfnPartnerAccount.() -> Unit): CfnPartnerAccount = CfnPartnerAccount(this,
    id).apply(initializer)

@Generated
public fun Construct.cfnPartnerAccount(id: String, props: CfnPartnerAccountProps): CfnPartnerAccount
    = CfnPartnerAccount(this, id, props)

@Generated
public fun Construct.cfnPartnerAccount(
  id: String,
  props: CfnPartnerAccountProps,
  initializer: @AwsCdkDsl CfnPartnerAccount.() -> Unit,
): CfnPartnerAccount = CfnPartnerAccount(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnPartnerAccount(id: String, initializer: @AwsCdkDsl
    CfnPartnerAccount.Builder.() -> Unit): CfnPartnerAccount =
    CfnPartnerAccount.Builder.create(this, id).apply(initializer).build()
