package com.faendir.awscdkkt.generated.services.connect

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.connect.CfnApprovedOrigin
import software.amazon.awscdk.services.connect.CfnApprovedOriginProps
import software.constructs.Construct

@Generated
public fun Construct.cfnApprovedOrigin(
  id: String,
  props: CfnApprovedOriginProps,
  initializer: @AwsCdkDsl CfnApprovedOrigin.() -> Unit = {},
): CfnApprovedOrigin = CfnApprovedOrigin(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnApprovedOrigin(id: String, initializer: @AwsCdkDsl
    CfnApprovedOrigin.Builder.() -> Unit = {}): CfnApprovedOrigin =
    CfnApprovedOrigin.Builder.create(this, id).apply(initializer).build()
