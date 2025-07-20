package com.faendir.awscdkkt.generated.services.iam

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iam.CfnServerCertificate
import software.amazon.awscdk.services.iam.CfnServerCertificateProps
import software.constructs.Construct

@Generated
public fun Construct.cfnServerCertificate(id: String, initializer: @AwsCdkDsl CfnServerCertificate.() -> Unit = {}): CfnServerCertificate = CfnServerCertificate(this, id).apply(initializer)

@Generated
public fun Construct.cfnServerCertificate(
  id: String,
  props: CfnServerCertificateProps,
  initializer: @AwsCdkDsl CfnServerCertificate.() -> Unit = {},
): CfnServerCertificate = CfnServerCertificate(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnServerCertificate(id: String, initializer: @AwsCdkDsl CfnServerCertificate.Builder.() -> Unit = {}): CfnServerCertificate = CfnServerCertificate.Builder.create(this, id).apply(initializer).build()
