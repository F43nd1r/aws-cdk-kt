package com.faendir.awscdkkt.generated.services.networkmanager

import com.faendir.awscdkkt.AwsCdkDsl
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
  initializer: @AwsCdkDsl CfnSite.() -> Unit = {},
): CfnSite = CfnSite(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnSite(id: String, initializer: @AwsCdkDsl CfnSite.Builder.() -> Unit = {}): CfnSite = CfnSite.Builder.create(this, id).apply(initializer).build()
