@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.iotwireless

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iotwireless.CfnPartnerAccount
import software.amazon.awscdk.services.iotwireless.CfnPartnerAccountProps
import software.constructs.Construct

public fun Construct.cfnPartnerAccount(id: String, initializer: CfnPartnerAccount.() -> Unit = {}):
    CfnPartnerAccount = CfnPartnerAccount(this, id).apply(initializer)

public fun Construct.cfnPartnerAccount(
  id: String,
  props: CfnPartnerAccountProps,
  initializer: CfnPartnerAccount.() -> Unit = {},
): CfnPartnerAccount = CfnPartnerAccount(this, id, props).apply(initializer)
