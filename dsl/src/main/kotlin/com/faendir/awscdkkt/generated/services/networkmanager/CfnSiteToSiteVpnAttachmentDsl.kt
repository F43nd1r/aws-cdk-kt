package com.faendir.awscdkkt.generated.services.networkmanager

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.networkmanager.CfnSiteToSiteVpnAttachment
import software.amazon.awscdk.services.networkmanager.CfnSiteToSiteVpnAttachmentProps
import software.constructs.Construct

@Generated
public fun Construct.cfnSiteToSiteVpnAttachment(
  id: String,
  props: CfnSiteToSiteVpnAttachmentProps,
  initializer: @AwsCdkDsl CfnSiteToSiteVpnAttachment.() -> Unit = {},
): CfnSiteToSiteVpnAttachment = CfnSiteToSiteVpnAttachment(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnSiteToSiteVpnAttachment(id: String, initializer: @AwsCdkDsl CfnSiteToSiteVpnAttachment.Builder.() -> Unit = {}): CfnSiteToSiteVpnAttachment = CfnSiteToSiteVpnAttachment.Builder.create(this, id).apply(initializer).build()
