@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.networkmanager

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.networkmanager.CfnSiteToSiteVpnAttachment
import software.amazon.awscdk.services.networkmanager.CfnSiteToSiteVpnAttachmentProps
import software.constructs.Construct

public fun Construct.cfnSiteToSiteVpnAttachment(
  id: String,
  props: CfnSiteToSiteVpnAttachmentProps,
  initializer: CfnSiteToSiteVpnAttachment.() -> Unit = {},
): CfnSiteToSiteVpnAttachment = CfnSiteToSiteVpnAttachment(this, id, props).apply(initializer)
