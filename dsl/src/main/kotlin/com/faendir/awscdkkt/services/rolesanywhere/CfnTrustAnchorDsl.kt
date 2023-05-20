@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.rolesanywhere

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.rolesanywhere.CfnTrustAnchor
import software.amazon.awscdk.services.rolesanywhere.CfnTrustAnchorProps
import software.constructs.Construct

public fun Construct.cfnTrustAnchor(
  id: String,
  props: CfnTrustAnchorProps,
  initializer: CfnTrustAnchor.() -> Unit = {},
): CfnTrustAnchor = CfnTrustAnchor(this, id, props).apply(initializer)
