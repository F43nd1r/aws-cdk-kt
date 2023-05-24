package com.faendir.awscdkkt.generated.services.rolesanywhere

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.rolesanywhere.CfnCRL
import software.amazon.awscdk.services.rolesanywhere.CfnCRLProps
import software.constructs.Construct

@Generated
public fun Construct.cfnCRL(id: String, props: CfnCRLProps): CfnCRL = CfnCRL(this, id, props)

@Generated
public fun Construct.cfnCRL(
  id: String,
  props: CfnCRLProps,
  initializer: @AwsCdkDsl CfnCRL.() -> Unit,
): CfnCRL = CfnCRL(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnCRL(id: String, initializer: @AwsCdkDsl CfnCRL.Builder.() -> Unit):
    CfnCRL = CfnCRL.Builder.create(this, id).apply(initializer).build()
