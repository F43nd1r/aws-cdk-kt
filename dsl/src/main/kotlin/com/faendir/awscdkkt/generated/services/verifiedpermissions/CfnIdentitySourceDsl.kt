package com.faendir.awscdkkt.generated.services.verifiedpermissions

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.verifiedpermissions.CfnIdentitySource
import software.amazon.awscdk.services.verifiedpermissions.CfnIdentitySourceProps
import software.constructs.Construct

@Generated
public fun Construct.cfnIdentitySource(
  id: String,
  props: CfnIdentitySourceProps,
  initializer: @AwsCdkDsl CfnIdentitySource.() -> Unit = {},
): CfnIdentitySource = CfnIdentitySource(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnIdentitySource(id: String, initializer: @AwsCdkDsl
    CfnIdentitySource.Builder.() -> Unit = {}): CfnIdentitySource =
    CfnIdentitySource.Builder.create(this, id).apply(initializer).build()
