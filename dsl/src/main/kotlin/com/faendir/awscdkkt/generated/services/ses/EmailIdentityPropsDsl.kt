package com.faendir.awscdkkt.generated.services.ses

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ses.EmailIdentityProps

@Generated
public fun buildEmailIdentityProps(initializer: @AwsCdkDsl EmailIdentityProps.Builder.() -> Unit =
    {}): EmailIdentityProps = EmailIdentityProps.Builder().apply(initializer).build()
