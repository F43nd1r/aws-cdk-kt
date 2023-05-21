package com.faendir.awscdkkt.services.codebuild

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codebuild.BitBucketSourceCredentialsProps

@Generated
public
    fun bitBucketSourceCredentialsProps(initializer: BitBucketSourceCredentialsProps.Builder.() -> Unit
    = {}): BitBucketSourceCredentialsProps =
    BitBucketSourceCredentialsProps.builder().apply(initializer).build()
