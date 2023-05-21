package com.faendir.awscdkkt.services.networkmanager

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
  initializer: CfnSiteToSiteVpnAttachment.() -> Unit = {},
): CfnSiteToSiteVpnAttachment = CfnSiteToSiteVpnAttachment(this, id, props).apply(initializer)
