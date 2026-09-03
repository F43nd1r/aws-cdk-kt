package com.faendir.awscdkkt.generated.services.supportauthz

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.supportauthz.CfnSupportPermit
import software.amazon.awscdk.services.supportauthz.CfnSupportPermitProps
import software.constructs.Construct

@Generated
public fun Construct.cfnSupportPermit(
  id: String,
  props: CfnSupportPermitProps,
  initializer: @AwsCdkDsl CfnSupportPermit.() -> Unit = {},
): CfnSupportPermit = CfnSupportPermit(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnSupportPermit(id: String, initializer: @AwsCdkDsl CfnSupportPermit.Builder.() -> Unit = {}): CfnSupportPermit = CfnSupportPermit.Builder.create(this, id).apply(initializer).build()
