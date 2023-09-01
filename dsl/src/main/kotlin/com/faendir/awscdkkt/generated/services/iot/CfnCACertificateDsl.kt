package com.faendir.awscdkkt.generated.services.iot

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iot.CfnCACertificate
import software.amazon.awscdk.services.iot.CfnCACertificateProps
import software.constructs.Construct

@Generated
public fun Construct.cfnCACertificate(
  id: String,
  props: CfnCACertificateProps,
  initializer: @AwsCdkDsl CfnCACertificate.() -> Unit = {},
): CfnCACertificate = CfnCACertificate(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnCACertificate(id: String, initializer: @AwsCdkDsl
    CfnCACertificate.Builder.() -> Unit = {}): CfnCACertificate =
    CfnCACertificate.Builder.create(this, id).apply(initializer).build()
