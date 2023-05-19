import com.faendir.awscdkkt.app
import com.faendir.awscdkkt.services.lambda.function
import com.faendir.awscdkkt.services.lambda.functionProps
import com.faendir.awscdkkt.stack
import software.amazon.awscdk.services.lambda.Code
import software.amazon.awscdk.services.lambda.Runtime

fun main() {
    app {
        stack("Lambda-Stack") {
            function("HelloHandler", functionProps {
                code(Code.fromInline("function handler() { console.log('Hello, CDK'); }"))
                handler("index.handler")
                runtime(Runtime.NODEJS_16_X)
            })
        }
    }.synth()
}