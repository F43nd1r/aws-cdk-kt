package com.faendir.awscdkkt.services.securityhub

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.securityhub.CfnHub
import software.amazon.awscdk.services.securityhub.CfnHubProps
import software.constructs.Construct

@Generated
public fun Construct.cfnHub(id: String, initializer: CfnHub.() -> Unit = {}): CfnHub = CfnHub(this,
    id).apply(initializer)

@Generated
public fun Construct.cfnHub(
  id: String,
  props: CfnHubProps,
  initializer: CfnHub.() -> Unit = {},
): CfnHub = CfnHub(this, id, props).apply(initializer)
