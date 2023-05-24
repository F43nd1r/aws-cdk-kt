package com.faendir.awscdkkt.generated.services.iot

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iot.CfnCertificate
import software.amazon.awscdk.services.iot.CfnCertificateProps
import software.constructs.Construct

@Generated
public fun Construct.cfnCertificate(id: String, props: CfnCertificateProps): CfnCertificate =
    CfnCertificate(this, id, props)

@Generated
public fun Construct.cfnCertificate(
  id: String,
  props: CfnCertificateProps,
  initializer: @AwsCdkDsl CfnCertificate.() -> Unit,
): CfnCertificate = CfnCertificate(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnCertificate(id: String, initializer: @AwsCdkDsl
    CfnCertificate.Builder.() -> Unit): CfnCertificate = CfnCertificate.Builder.create(this,
    id).apply(initializer).build()
