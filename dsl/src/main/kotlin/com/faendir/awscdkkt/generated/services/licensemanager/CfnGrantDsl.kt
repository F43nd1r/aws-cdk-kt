package com.faendir.awscdkkt.generated.services.licensemanager

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.licensemanager.CfnGrant
import software.amazon.awscdk.services.licensemanager.CfnGrantProps
import software.constructs.Construct

@Generated
public fun Construct.cfnGrant(id: String, initializer: @AwsCdkDsl CfnGrant.() -> Unit = {}):
    CfnGrant = CfnGrant(this, id).apply(initializer)

@Generated
public fun Construct.cfnGrant(
  id: String,
  props: CfnGrantProps,
  initializer: @AwsCdkDsl CfnGrant.() -> Unit = {},
): CfnGrant = CfnGrant(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnGrant(id: String, initializer: @AwsCdkDsl CfnGrant.Builder.() -> Unit =
    {}): CfnGrant = CfnGrant.Builder.create(this, id).apply(initializer).build()
