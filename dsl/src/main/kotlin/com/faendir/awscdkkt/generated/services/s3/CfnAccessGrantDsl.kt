package com.faendir.awscdkkt.generated.services.s3

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.s3.CfnAccessGrant
import software.amazon.awscdk.services.s3.CfnAccessGrantProps
import software.constructs.Construct

@Generated
public fun Construct.cfnAccessGrant(
  id: String,
  props: CfnAccessGrantProps,
  initializer: @AwsCdkDsl CfnAccessGrant.() -> Unit = {},
): CfnAccessGrant = CfnAccessGrant(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnAccessGrant(id: String, initializer: @AwsCdkDsl
    CfnAccessGrant.Builder.() -> Unit = {}): CfnAccessGrant = CfnAccessGrant.Builder.create(this,
    id).apply(initializer).build()
