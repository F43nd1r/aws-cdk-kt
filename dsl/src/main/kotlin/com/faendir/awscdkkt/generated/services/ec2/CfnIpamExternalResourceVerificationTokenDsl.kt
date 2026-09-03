package com.faendir.awscdkkt.generated.services.ec2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnIpamExternalResourceVerificationToken
import software.amazon.awscdk.services.ec2.CfnIpamExternalResourceVerificationTokenProps
import software.constructs.Construct

@Generated
public fun Construct.cfnIpamExternalResourceVerificationToken(
  id: String,
  props: CfnIpamExternalResourceVerificationTokenProps,
  initializer: @AwsCdkDsl CfnIpamExternalResourceVerificationToken.() -> Unit = {},
): CfnIpamExternalResourceVerificationToken = CfnIpamExternalResourceVerificationToken(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnIpamExternalResourceVerificationToken(id: String, initializer: @AwsCdkDsl CfnIpamExternalResourceVerificationToken.Builder.() -> Unit = {}): CfnIpamExternalResourceVerificationToken = CfnIpamExternalResourceVerificationToken.Builder.create(this, id).apply(initializer).build()
