package com.faendir.awscdkkt.generated.services.securityhub

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.securityhub.CfnSecurityControl
import software.amazon.awscdk.services.securityhub.CfnSecurityControlProps
import software.constructs.Construct

@Generated
public fun Construct.cfnSecurityControl(
  id: String,
  props: CfnSecurityControlProps,
  initializer: @AwsCdkDsl CfnSecurityControl.() -> Unit = {},
): CfnSecurityControl = CfnSecurityControl(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnSecurityControl(id: String, initializer: @AwsCdkDsl CfnSecurityControl.Builder.() -> Unit = {}): CfnSecurityControl = CfnSecurityControl.Builder.create(this, id).apply(initializer).build()
