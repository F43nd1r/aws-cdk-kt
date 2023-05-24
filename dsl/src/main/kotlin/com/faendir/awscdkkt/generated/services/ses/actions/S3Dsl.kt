package com.faendir.awscdkkt.generated.services.ses.actions

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ses.actions.S3
import software.amazon.awscdk.services.ses.actions.S3Props

@Generated
public fun s3(props: S3Props): S3 = S3(props)

@Generated
public fun buildS3(initializer: @AwsCdkDsl S3.Builder.() -> Unit): S3 =
    S3.Builder.create().apply(initializer).build()
