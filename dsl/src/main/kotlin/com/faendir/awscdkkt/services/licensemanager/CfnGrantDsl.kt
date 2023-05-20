@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.licensemanager

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.licensemanager.CfnGrant
import software.amazon.awscdk.services.licensemanager.CfnGrantProps
import software.constructs.Construct

public fun Construct.cfnGrant(
  id: String,
  props: CfnGrantProps,
  initializer: CfnGrant.() -> Unit = {},
): CfnGrant = CfnGrant(this, id, props).apply(initializer)

public fun Construct.cfnGrant(id: String, initializer: CfnGrant.() -> Unit = {}): CfnGrant =
    CfnGrant(this, id).apply(initializer)
