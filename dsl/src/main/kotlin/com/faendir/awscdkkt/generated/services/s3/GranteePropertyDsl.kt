package com.faendir.awscdkkt.generated.services.s3

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.s3.CfnAccessGrant

@Generated
public fun buildGranteeProperty(initializer: @AwsCdkDsl
    CfnAccessGrant.GranteeProperty.Builder.() -> Unit = {}): CfnAccessGrant.GranteeProperty =
    CfnAccessGrant.GranteeProperty.Builder().apply(initializer).build()
