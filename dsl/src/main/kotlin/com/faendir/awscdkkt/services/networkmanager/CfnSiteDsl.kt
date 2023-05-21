package com.faendir.awscdkkt.services.networkmanager

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.networkmanager.CfnSite
import software.amazon.awscdk.services.networkmanager.CfnSiteProps
import software.constructs.Construct

@Generated
public fun Construct.cfnSite(
  id: String,
  props: CfnSiteProps,
  initializer: CfnSite.() -> Unit = {},
): CfnSite = CfnSite(this, id, props).apply(initializer)
