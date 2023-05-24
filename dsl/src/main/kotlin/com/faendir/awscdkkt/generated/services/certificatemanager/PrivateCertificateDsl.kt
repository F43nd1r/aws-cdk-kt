package com.faendir.awscdkkt.generated.services.certificatemanager

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.certificatemanager.PrivateCertificate
import software.amazon.awscdk.services.certificatemanager.PrivateCertificateProps
import software.constructs.Construct

@Generated
public fun Construct.privateCertificate(id: String, props: PrivateCertificateProps):
    PrivateCertificate = PrivateCertificate(this, id, props)

@Generated
public fun Construct.privateCertificate(
  id: String,
  props: PrivateCertificateProps,
  initializer: @AwsCdkDsl PrivateCertificate.() -> Unit,
): PrivateCertificate = PrivateCertificate(this, id, props).apply(initializer)

@Generated
public fun Construct.buildPrivateCertificate(id: String, initializer: @AwsCdkDsl
    PrivateCertificate.Builder.() -> Unit): PrivateCertificate =
    PrivateCertificate.Builder.create(this, id).apply(initializer).build()
