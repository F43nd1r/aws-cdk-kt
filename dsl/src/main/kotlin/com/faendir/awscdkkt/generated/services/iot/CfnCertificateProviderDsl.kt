package com.faendir.awscdkkt.generated.services.iot

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iot.CfnCertificateProvider
import software.amazon.awscdk.services.iot.CfnCertificateProviderProps
import software.constructs.Construct

@Generated
public fun Construct.cfnCertificateProvider(
  id: String,
  props: CfnCertificateProviderProps,
  initializer: @AwsCdkDsl CfnCertificateProvider.() -> Unit = {},
): CfnCertificateProvider = CfnCertificateProvider(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnCertificateProvider(id: String, initializer: @AwsCdkDsl
    CfnCertificateProvider.Builder.() -> Unit = {}): CfnCertificateProvider =
    CfnCertificateProvider.Builder.create(this, id).apply(initializer).build()
