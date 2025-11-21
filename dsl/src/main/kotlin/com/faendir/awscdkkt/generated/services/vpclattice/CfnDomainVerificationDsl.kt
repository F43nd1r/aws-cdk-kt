package com.faendir.awscdkkt.generated.services.vpclattice

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.vpclattice.CfnDomainVerification
import software.amazon.awscdk.services.vpclattice.CfnDomainVerificationProps
import software.constructs.Construct

@Generated
public fun Construct.cfnDomainVerification(
  id: String,
  props: CfnDomainVerificationProps,
  initializer: @AwsCdkDsl CfnDomainVerification.() -> Unit = {},
): CfnDomainVerification = CfnDomainVerification(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnDomainVerification(id: String, initializer: @AwsCdkDsl CfnDomainVerification.Builder.() -> Unit = {}): CfnDomainVerification = CfnDomainVerification.Builder.create(this, id).apply(initializer).build()
