@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.securityhub

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.securityhub.CfnHub
import software.amazon.awscdk.services.securityhub.CfnHubProps
import software.constructs.Construct

public fun Construct.cfnHub(id: String, initializer: CfnHub.() -> Unit = {}): CfnHub = CfnHub(this,
    id).apply(initializer)

public fun Construct.cfnHub(
  id: String,
  props: CfnHubProps,
  initializer: CfnHub.() -> Unit = {},
): CfnHub = CfnHub(this, id, props).apply(initializer)
