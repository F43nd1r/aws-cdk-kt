package com.faendir.awscdkkt.services.iotwireless

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iotwireless.CfnPartnerAccount
import software.amazon.awscdk.services.iotwireless.CfnPartnerAccountProps
import software.constructs.Construct

@Generated
public fun Construct.cfnPartnerAccount(id: String, initializer: CfnPartnerAccount.() -> Unit = {}):
    CfnPartnerAccount = CfnPartnerAccount(this, id).apply(initializer)

@Generated
public fun Construct.cfnPartnerAccount(
  id: String,
  props: CfnPartnerAccountProps,
  initializer: CfnPartnerAccount.() -> Unit = {},
): CfnPartnerAccount = CfnPartnerAccount(this, id, props).apply(initializer)
