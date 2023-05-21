package com.faendir.awscdkkt.services.rolesanywhere

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.rolesanywhere.CfnTrustAnchor
import software.amazon.awscdk.services.rolesanywhere.CfnTrustAnchorProps
import software.constructs.Construct

@Generated
public fun Construct.cfnTrustAnchor(
  id: String,
  props: CfnTrustAnchorProps,
  initializer: CfnTrustAnchor.() -> Unit = {},
): CfnTrustAnchor = CfnTrustAnchor(this, id, props).apply(initializer)
