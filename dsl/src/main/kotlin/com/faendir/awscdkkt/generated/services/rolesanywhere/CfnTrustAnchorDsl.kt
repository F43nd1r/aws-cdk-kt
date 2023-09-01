package com.faendir.awscdkkt.generated.services.rolesanywhere

import com.faendir.awscdkkt.AwsCdkDsl
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
  initializer: @AwsCdkDsl CfnTrustAnchor.() -> Unit = {},
): CfnTrustAnchor = CfnTrustAnchor(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnTrustAnchor(id: String, initializer: @AwsCdkDsl
    CfnTrustAnchor.Builder.() -> Unit = {}): CfnTrustAnchor = CfnTrustAnchor.Builder.create(this,
    id).apply(initializer).build()
