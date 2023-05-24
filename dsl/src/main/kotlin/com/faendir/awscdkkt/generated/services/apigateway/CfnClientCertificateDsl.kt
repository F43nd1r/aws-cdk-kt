package com.faendir.awscdkkt.generated.services.apigateway

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.CfnClientCertificate
import software.amazon.awscdk.services.apigateway.CfnClientCertificateProps
import software.constructs.Construct

@Generated
public fun Construct.cfnClientCertificate(id: String): CfnClientCertificate =
    CfnClientCertificate(this, id)

@Generated
public fun Construct.cfnClientCertificate(id: String, initializer: @AwsCdkDsl
    CfnClientCertificate.() -> Unit): CfnClientCertificate = CfnClientCertificate(this,
    id).apply(initializer)

@Generated
public fun Construct.cfnClientCertificate(id: String, props: CfnClientCertificateProps):
    CfnClientCertificate = CfnClientCertificate(this, id, props)

@Generated
public fun Construct.cfnClientCertificate(
  id: String,
  props: CfnClientCertificateProps,
  initializer: @AwsCdkDsl CfnClientCertificate.() -> Unit,
): CfnClientCertificate = CfnClientCertificate(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnClientCertificate(id: String, initializer: @AwsCdkDsl
    CfnClientCertificate.Builder.() -> Unit): CfnClientCertificate =
    CfnClientCertificate.Builder.create(this, id).apply(initializer).build()
